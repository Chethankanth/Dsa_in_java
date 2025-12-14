#include <stdio.h>
#include <string.h>

char stack[50];
int top = -1;

// Push a character into the stack
void push(char c) {
    stack[++top] = c;
}

// Function to check and reduce patterns
void reduce() {
    int i;

    // Rule: id → E (id is represented by i)
    for (i = 0; i <= top; i++) {
        if (stack[i] == 'i' && stack[i+1] == 'd') {
            stack[i] = 'E';
            for (int j = i+1; j <= top; j++)
                stack[j] = stack[j+1];
            top--;
            printf("REDUCE: id → E\n");
            return;
        }
    }

    // Rule: E + E → E
    for (i = 0; i <= top - 2; i++) {
        if (stack[i] == 'E' && stack[i+1] == '+' && stack[i+2] == 'E') {
            stack[i] = 'E';
            for (int j = i+1; j <= top-2; j++)
                stack[j] = stack[j+2];
            top -= 2;
            printf("REDUCE: E + E → E\n");
            return;
        }
    }

    // Rule: E * E → E
    for (i = 0; i <= top - 2; i++) {
        if (stack[i] == 'E' && stack[i+1] == '*' && stack[i+2] == 'E') {
            stack[i] = 'E';
            for (int j = i+1; j <= top-2; j++)
                stack[j] = stack[j+2];
            top -= 2;
            printf("REDUCE: E * E → E\n");
            return;
        }
    }
}

int main() {
    char input[50];
    int i = 0;

    printf("Enter the input string: ");
    scanf("%s", input);

    printf("\nSHIFT–REDUCE PARSER\n");
    printf("--------------------\n");

    while (i < strlen(input)) {
        printf("\nSHIFT: %c\n", input[i]);
        push(input[i]);
        i++;

        // Try reduction after every shift
        reduce();
        
        printf("STACK: ");
        for (int k = 0; k <= top; k++)
            printf("%c", stack[k]);
        printf("\n");
    }

    // Final reduction check (if possible)
    reduce();

    if (top == 0 && stack[0] == 'E')
        printf("\nACCEPTED: Successful Parsing\n");
    else
        printf("\nREJECTED: Parsing Failed\n");

    return 0;
}