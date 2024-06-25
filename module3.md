Requirements
Complete the task of "[Bowling Score Calculation]" using TDD with Codium/Copilot.

● Design a program to compute the total score for a game of bowling, adhering to the following scoring rules:
● Each game consists of ten frames, during which a player attempts to knock down ten pins with up to two balls per frame.
The objective is to knock down all pins with as few throws as possible.
● - **Strike (X):** If all ten pins are knocked down on the first ball of a frame, it's a strike. The score for that frame is 10
plus the sum of the pin falls from the next two balls thrown (which could include strikes and spares).
● - **Spare (/):** If the remaining pins are knocked down with the second ball of a frame (after not getting a strike on the
first), it's a spare. The score for that frame is 10 plus the number of pins knocked down with the first ball of the next
frame.
● - **Open Frame:** If neither a strike nor a spare is achieved in a frame, the score for that frame is simply the sum of the
pins knocked down in the two throws without any bonus.
● In the tenth frame, if a player gets a strike or a spare, they are allowed to throw one or two additional balls, respectively,
to complete the frame.
● The total score for the game is the sum of all scores from the ten frames.
● Implement this scoring system using TDD, ensuring comprehensive test coverage for various scenarios, including strikes,
spares, open frames, and the special rules applying to the tenth frame.