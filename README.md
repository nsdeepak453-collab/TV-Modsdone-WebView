# TV Modsdone WebView

A minimal Android Studio project that opens `http://tv.modsdone.in/` directly in a native Android WebView.

## Build
1. Install Android Studio.
2. Open this folder (`TVModsdoneWebView`) in Android Studio.
3. Allow Gradle sync to finish.
4. Connect an Android phone or use an emulator.
5. Select **Build > Build APK(s)**.
6. Install the generated APK from `app/build/outputs/apk/debug/`.

## Notes
- This app uses Android System WebView supplied by the device.
- JavaScript, DOM storage, cookies, and HTML5 fullscreen video support are enabled.
- The project permits HTTP cleartext traffic because the requested URL uses `http://`.
- The app does not bypass the website's app authorization. If the server rejects this WebView, it may still show its Unauthorized App message.
- For better transport security, change the URL in `MainActivity.kt` to `https://tv.modsdone.in/` if the site supports HTTPS.

## Build using only an Android phone (GitHub Actions)
1. Extract this ZIP using your phone's Files app.
2. In Chrome, create a new repository on GitHub.
3. Upload the extracted project files and folders to the repository (including the hidden `.github/workflows/build-apk.yml` file).
4. Open the repository's **Actions** tab and run **Build Android APK**.
5. When the workflow finishes, open its run, scroll to **Artifacts**, and download `TV-Modsdone-debug-APK`.
6. Extract the downloaded artifact ZIP and install `app-debug.apk`.

If GitHub's mobile site hides the Actions tab, enable **Desktop site** in Chrome.
