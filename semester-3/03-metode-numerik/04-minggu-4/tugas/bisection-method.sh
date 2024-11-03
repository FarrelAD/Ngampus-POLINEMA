#!/bin/sh

cat <<EOF
   GUIDANCE! THIS IS IMPORTANT
==================================
1. You need to write manually the equation
2. If there is multiplication, put asterisk (*) symbol
3. If there is addition, put plus (+) symbol
4. If there is subtraction, put minus (-) symbol
5. If there is division, put slash (/) symbol
6. IF there is exponentiation, put power (^) symbol

Example: 
Math equation: x^2+2x-20
Input: x^2 + 2*x - 20

EOF

echo -n "Enter your equation: "
read equation_input

equation_func() {
    local x=$1 # x as parameter of this function
    result=$(echo "$equation_input" | sed "s/x/$x/g" | bc -l 2>/dev/null)
    if [ -z "$result" ]; then
        echo "0"
    else
        printf "%.10g" "$result"
    fi
}

echo "Add range: "
echo -n "- Left x (a): "
read left_x_boundary
echo -n "- Right x (b): "
read right_x_boundary
echo -n "Max iteration: "
read max_iteration
# echo -n "Min error: "
# read min_error

# if [ -z "$min_error" ]; then
#     min_error=0
# fi

iteration=0

bisection_method() {
    iteration=$((iteration + 1))
    
    fa=$(equation_func $left_x_boundary)
    fb=$(equation_func $right_x_boundary)

    if [ "$(echo "$fa * $fb > 0" | bc -l)" -eq 1 ]; then
        echo "No root found in this interval using the bisection method."
        return
    fi
    
    # x_value is an x coordinate that lies between x boundaries
    x_value=$(awk "BEGIN {print ($left_x_boundary + $right_x_boundary) / 2}")
    fx=$(equation_func $x_value)
    # error=$(awk "BEGIN {print ($right_x_boundary - $left_x_boundary)}")

    echo "Iteration $iteration:"
    echo "a = $left_x_boundary"
    echo "b = $right_x_boundary"
    echo "x = $x_value"
    echo "f(a) = $fa"
    echo "f(b) = $fb"
    echo "f(x) = $fx"
    # echo "error = $error"
    echo ""

    # error checking: [ "$(echo "$error <= $min_error" | bc -l)" -eq 1 ]
    if [ "$(echo "$fx == 0" | bc -l)" -eq 1 ] || [ "$iteration" -ge "$max_iteration" ]; then
        echo "================================================================================"
        echo "Root found for equation $equation_input using the bisection method at x=$x_value and f(x)=$fx"
        return
    fi


    if [ "$(echo "$fa * $fx < 0" | bc -l)" -eq 1 ]; then
        right_x_boundary=$x_value
    else
        left_x_boundary=$x_value
    fi
    
    bisection_method
}

bisection_method

echo "================================================================================"
echo "Final result: $x_value"
echo "Iterations: $iteration"
# echo "Error: $error"
