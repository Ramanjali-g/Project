tasks=[]
while True:                                             
    print("Welcome to the To-Do List App!")
    print("1. Add Task")
    print("2. View Tasks")
    print("3. Remove Task")
    print("4. Exit")
    choice = int(input("Enter your choice (1-4): "))
    if choice == 1:
        task=input("Enter the task you want to add: ")
        tasks.append(task)
        print("Task added successfully!")
    elif choice == 2:
        if len(tasks)==0:
            print("NO task found!")
        else:
            for i in range(len(tasks)):
                print(f"{i+1}.{tasks[i]}")
    elif choice == 3:
        if len(tasks)==0:
            print("No task found!")
        else:
            for i in range(len(tasks)):
                print(f"{i+1}.{tasks[i]}")
            task_num=int(input("Enter the task number you want to remove: "))
            if 1<=task_num<=len(tasks):
                remove=tasks.pop(task_num-1)
                print("Task removed successfully!")
            else:
                print("Invalid task number!")
    elif choice == 4:
        print("Exiting the To-Do List App. Goodbye!")
        break
    else:
        print("Invalid choice! Please enter a number between 1 and 4.") 