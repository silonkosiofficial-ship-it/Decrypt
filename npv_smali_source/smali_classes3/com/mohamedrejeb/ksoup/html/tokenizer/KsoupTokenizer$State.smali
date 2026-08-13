.class public final enum Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0c86"
    }
    d2 = {
        "\u0c87",
        "",
        "\u0c88",
        "\u0c89",
        "\u0c8a",
        "\u0c8b",
        "\u0c8c",
        "\u0c8d",
        "\u0c8e",
        "\u0c8f",
        "\u0c90",
        "\u0c91",
        "\u0c92",
        "\u0c93",
        "\u0c94",
        "\u0c95",
        "\u0c96",
        "\u0c97",
        "\u0c98",
        "\u0c99",
        "\u0c9a",
        "\u0c9b",
        "\u0c9c",
        "\u0c9d",
        "\u0c9e",
        "\u0c9f",
        "\u0ca0",
        "\u0ca1",
        "\u0ca2",
        "\u0ca3",
        "\u0ca4"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lp7/a;

.field private static final synthetic $VALUES:[Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum AfterAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum AfterClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum BeforeAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum BeforeAttributeValue:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum BeforeClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum BeforeComment:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum BeforeDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum BeforeSpecialS:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum BeforeSpecialT:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum BeforeTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum CDATASequence:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InAttributeValueDq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InAttributeValueNq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InAttributeValueSq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InCommentLike:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InEntity:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InProcessingInstruction:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InSelfClosingTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InSpecialComment:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InSpecialTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum InTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum SpecialStartSequence:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

.field public static final enum Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;


# direct methods
.method private static final synthetic $values()[Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;
    .locals 3

    const/16 v0, 0x1a

    new-array v0, v0, [Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSelfClosingTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->AfterClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->AfterAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeValue:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueDq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueSq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueNq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InProcessingInstruction:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeComment:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->CDATASequence:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSpecialComment:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InCommentLike:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeSpecialS:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeSpecialT:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->SpecialStartSequence:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSpecialTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InEntity:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "Text"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->Text:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "BeforeTagName"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InTagName"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InSelfClosingTag"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSelfClosingTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "BeforeClosingTagName"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InClosingTagName"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "AfterClosingTagName"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->AfterClosingTagName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "BeforeAttributeName"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InAttributeName"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "AfterAttributeName"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->AfterAttributeName:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "BeforeAttributeValue"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeAttributeValue:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InAttributeValueDq"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueDq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InAttributeValueSq"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueSq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InAttributeValueNq"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InAttributeValueNq:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "BeforeDeclaration"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InDeclaration"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InDeclaration:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InProcessingInstruction"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InProcessingInstruction:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "BeforeComment"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeComment:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "CDATASequence"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->CDATASequence:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InSpecialComment"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSpecialComment:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InCommentLike"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InCommentLike:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "BeforeSpecialS"

    const/16 v2, 0x15

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeSpecialS:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "BeforeSpecialT"

    const/16 v2, 0x16

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->BeforeSpecialT:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "SpecialStartSequence"

    const/16 v2, 0x17

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->SpecialStartSequence:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InSpecialTag"

    const/16 v2, 0x18

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InSpecialTag:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    const-string v1, "InEntity"

    const/16 v2, 0x19

    invoke-direct {v0, v1, v2}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->InEntity:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-static {}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->$values()[Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    move-result-object v0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->$VALUES:[Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->$ENTRIES:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lp7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp7/a;"
        }
    .end annotation

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->$ENTRIES:Lp7/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;
    .locals 1

    const-class v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    return-object p0
.end method

.method public static values()[Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;->$VALUES:[Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$State;

    return-object v0
.end method
