package eu.darken.sdmse.corpsefinder.ui.details

import androidx.lifecycle.SavedStateHandle
import dagger.hilt.android.lifecycle.HiltViewModel
import eu.darken.sdmse.common.coroutine.DispatcherProvider
import eu.darken.sdmse.common.debug.logging.logTag
import eu.darken.sdmse.common.uix.ViewModel3
import eu.darken.sdmse.corpsefinder.core.CorpseFinder
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class CorpseFinderDetailsFragmentVM @Inject constructor(
    @Suppress("UNUSED_PARAMETER") handle: SavedStateHandle,
    dispatcherProvider: DispatcherProvider,
    private val corpseFinder: CorpseFinder,
) : ViewModel3(dispatcherProvider = dispatcherProvider) {

    companion object {
        private val TAG = logTag("CorpseFinder", "Details", "Fragment", "VM")
    }
}