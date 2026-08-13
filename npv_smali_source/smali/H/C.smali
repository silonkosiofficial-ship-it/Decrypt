.class public final enum LH/C;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum D:LH/C;

.field public static final enum E:LH/C;

.field public static final enum F:LH/C;

.field public static final enum G:LH/C;

.field private static final synthetic H:[LH/C;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LH/C;

    const/4 v1, 0x0

    const v2, 0x1040003

    const-string v3, "Cut"

    invoke-direct {v0, v3, v1, v2}, LH/C;-><init>(Ljava/lang/String;II)V

    sput-object v0, LH/C;->D:LH/C;

    new-instance v0, LH/C;

    const/4 v1, 0x1

    const v2, 0x1040001

    const-string v3, "Copy"

    invoke-direct {v0, v3, v1, v2}, LH/C;-><init>(Ljava/lang/String;II)V

    sput-object v0, LH/C;->E:LH/C;

    new-instance v0, LH/C;

    const/4 v1, 0x2

    const v2, 0x104000b

    const-string v3, "Paste"

    invoke-direct {v0, v3, v1, v2}, LH/C;-><init>(Ljava/lang/String;II)V

    sput-object v0, LH/C;->F:LH/C;

    new-instance v0, LH/C;

    const/4 v1, 0x3

    const v2, 0x104000d

    const-string v3, "SelectAll"

    invoke-direct {v0, v3, v1, v2}, LH/C;-><init>(Ljava/lang/String;II)V

    sput-object v0, LH/C;->G:LH/C;

    invoke-static {}, LH/C;->e()[LH/C;

    move-result-object v0

    sput-object v0, LH/C;->H:[LH/C;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LH/C;->C:I

    return-void
.end method

.method private static final synthetic e()[LH/C;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LH/C;

    sget-object v1, LH/C;->D:LH/C;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LH/C;->E:LH/C;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LH/C;->F:LH/C;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LH/C;->G:LH/C;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH/C;
    .locals 1

    const-class v0, LH/C;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH/C;

    return-object p0
.end method

.method public static values()[LH/C;
    .locals 1

    sget-object v0, LH/C;->H:[LH/C;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH/C;

    return-object v0
.end method


# virtual methods
.method public final g(LV/n;I)Ljava/lang/String;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)"

    const v2, -0x12744279

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget p2, p0, LH/C;->C:I

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, LI0/d;->a(ILV/n;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method
