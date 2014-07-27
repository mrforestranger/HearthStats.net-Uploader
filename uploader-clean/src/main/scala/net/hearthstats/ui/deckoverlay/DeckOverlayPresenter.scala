package net.hearthstats.ui.deckoverlay

import net.hearthstats.core.{Card, Deck}

/**
 * Defines how the deck overlay will be used.
 */
trait DeckOverlayPresenterComponent {
  val deckOverlay: DeckOverlayPresenter

  trait DeckOverlayPresenter {
    /**
     * Initial deck.
     */
    def showDeck(deck: Deck)

    /**
     * When a card is drawn.
     */
    def removeCard(card: Card)

    /**
     * When a card is replaced (ie mulligan).
     */
    def addCard(card: Card)
  }
}