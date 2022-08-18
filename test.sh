echo "testing 'Hello World'"
java -cp bin/ App

echo "testing 'Hello Mehrab' from args"
java -cp bin/ App -n Mehrab

echo "testing 'Hello Mehrab' from stdin"
echo 'Mehrab' | java -cp bin/ App -s