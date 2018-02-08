# Visa Mate App
This is an Android App to help with Australian Visa process. Created as a Community Project, Open Source and non-profit.

## Motivation

Help people to understand and follow the Australian Government process to get their Visa. And also practice/teach Android Development.

## Team

As a community project we are open to new developers, designers, testers and other who want to learn and help.
<BR>If you want to make this happen, feel free to submit a Pull Request and Join our WhatsApp [Group](https://chat.whatsapp.com/L3am5wic4RJCQFywliP6La)
<BR>Special thanks to all [Contributors](https://github.com/gabeira/VisaMate/graphs/contributors)

## Installation

This Project still under development, fell free to help improve, to configure follow steps below:

- Download the code from this Repository via [Android Studio](https://youtu.be/Z98hXV9GmzY) or command line running:

      git clone https://github.com/gabeira/VisaMate

- Finally, to Build the Project, you can use Android Studio or from command line just run:

      ./gradlew build

- (Optional) To install debug app from command line use:

      ./adb install /app/build/outputs/apk/app-debug.apk

## External Libs Reference

- [MaterialStepperView](https://github.com/fython/MaterialStepperView)
- [Bumptech Glide](https://github.com/bumptech/glide)
- [Apache Commons Lang](https://commons.apache.org/proper/commons-lang/)

## Tests

There is some small tests done, but essential for the functionalities, you can run on Android Studio or from the command line,
to run the Unit Tests just use:

    ./gradlew test

Also there is some Connected Android Tests, but this requires to have a device or emulator connected:

    ./gradlew connectedAndroidTest

## Support

We have the support from the Brazilian Community [ITBR](https://www.facebook.com/itbraustralia/)
<BR>All the information to build this App come from Government websites like:

- [Australian Gov](https://www.australia.gov.au)
- [Department of Home Affairs](https://www.homeaffairs.gov.au)
- [Points Table](https://www.homeaffairs.gov.au/visas/supporting/Pages/skilled/The-points-table.aspx)
- [English Requirements](https://www.homeaffairs.gov.au/lega/lega/Form/Immi-FAQs/aelt)

## Disclaimer

For you personal and specific case please consult a [Registered Migration Agent](https://www.homeaffairs.gov.au/trav/visa/usin)