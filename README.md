# Fragment-Activity Communication

This project demonstrates the core concepts of communication between Fragments and their host Activity in Android. It implements a simple counter mechanism where a Fragment sends data (incrementing clicks) back to the Activity using an interface.

## Project Overview

The application consists of a single `MainActivity` which hosts a `BlankFragment`. The communication flow is as follows:
1. The **Fragment** captures a user interaction (button click).
2. The **Fragment** invokes a callback method through a defined interface (`OnFragmentInteractionListener`).
3. The **Activity** implements this interface and updates its UI (a TextView) based on the data received from the fragment.

## Key Components

- **`MainActivity.java`**: The host activity that implements the listener and updates the total count displayed on the screen.
- **`BlankFragment.java`**: A simple fragment containing a button. It triggers the communication event when the button is clicked.
- **`OnFragmentInteractionListener.java`**: The interface that defines the contract for communication between the fragment and the activity.
- **`Restaurant.java` & `OnRestaurantSelectedListener.java`**: Prepared components for extending the communication pattern to handle object-based data (e.g., selecting an item from a list).

## How to Run

1. Clone the repository.
2. Open the project in **Android Studio**.
3. Build the project using Gradle (AGP 8.0.2 / Gradle 8.0).
4. Run the app on an emulator or a physical device.

## Prerequisites

- Android Studio Flamingo or later.
- JDK 17.
- Android SDK 34.

## License

This project is for educational purposes.
