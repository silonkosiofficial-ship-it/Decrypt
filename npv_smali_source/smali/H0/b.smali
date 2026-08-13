.class public final enum LH0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH0/b$a;
    }
.end annotation


# static fields
.field public static final enum E:LH0/b;

.field public static final enum F:LH0/b;

.field public static final enum G:LH0/b;

.field public static final enum H:LH0/b;

.field private static final synthetic I:[LH0/b;


# instance fields
.field private final C:I

.field private final D:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LH0/b;

    const-string v1, "Copy"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LH0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LH0/b;->E:LH0/b;

    new-instance v0, LH0/b;

    const-string v1, "Paste"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LH0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LH0/b;->F:LH0/b;

    new-instance v0, LH0/b;

    const-string v1, "Cut"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, LH0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LH0/b;->G:LH0/b;

    new-instance v0, LH0/b;

    const-string v1, "SelectAll"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, LH0/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LH0/b;->H:LH0/b;

    invoke-static {}, LH0/b;->e()[LH0/b;

    move-result-object v0

    sput-object v0, LH0/b;->I:[LH0/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LH0/b;->C:I

    iput p3, p0, LH0/b;->D:I

    return-void
.end method

.method private static final synthetic e()[LH0/b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LH0/b;

    sget-object v1, LH0/b;->E:LH0/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LH0/b;->F:LH0/b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LH0/b;->G:LH0/b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LH0/b;->H:LH0/b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH0/b;
    .locals 1

    const-class v0, LH0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH0/b;

    return-object p0
.end method

.method public static values()[LH0/b;
    .locals 1

    sget-object v0, LH0/b;->I:[LH0/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH0/b;

    return-object v0
.end method


# virtual methods
.method public final g()I
    .locals 1

    iget v0, p0, LH0/b;->C:I

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, LH0/b;->D:I

    return v0
.end method

.method public final m()I
    .locals 2

    .prologue
    sget-object v0, LH0/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const v0, 0x104000d

    goto :goto_0

    :cond_0
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_1
    const v0, 0x1040003

    goto :goto_0

    :cond_2
    const v0, 0x104000b

    goto :goto_0

    :cond_3
    const v0, 0x1040001

    :goto_0
    return v0
.end method
