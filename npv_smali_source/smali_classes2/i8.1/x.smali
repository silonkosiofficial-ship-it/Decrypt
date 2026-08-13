.class public final enum Li8/x;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp8/j$a;


# static fields
.field public static final enum D:Li8/x;

.field public static final enum E:Li8/x;

.field public static final enum F:Li8/x;

.field public static final enum G:Li8/x;

.field public static final enum H:Li8/x;

.field public static final enum I:Li8/x;

.field private static J:Lp8/j$b;

.field private static final synthetic K:[Li8/x;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Li8/x;

    const-string v1, "INTERNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Li8/x;-><init>(Ljava/lang/String;III)V

    sput-object v0, Li8/x;->D:Li8/x;

    new-instance v1, Li8/x;

    const-string v3, "PRIVATE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4, v4}, Li8/x;-><init>(Ljava/lang/String;III)V

    sput-object v1, Li8/x;->E:Li8/x;

    new-instance v3, Li8/x;

    const-string v5, "PROTECTED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6, v6}, Li8/x;-><init>(Ljava/lang/String;III)V

    sput-object v3, Li8/x;->F:Li8/x;

    new-instance v5, Li8/x;

    const-string v7, "PUBLIC"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8, v8}, Li8/x;-><init>(Ljava/lang/String;III)V

    sput-object v5, Li8/x;->G:Li8/x;

    new-instance v7, Li8/x;

    const-string v9, "PRIVATE_TO_THIS"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10, v10}, Li8/x;-><init>(Ljava/lang/String;III)V

    sput-object v7, Li8/x;->H:Li8/x;

    new-instance v9, Li8/x;

    const-string v11, "LOCAL"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12, v12}, Li8/x;-><init>(Ljava/lang/String;III)V

    sput-object v9, Li8/x;->I:Li8/x;

    const/4 v11, 0x6

    new-array v11, v11, [Li8/x;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Li8/x;->K:[Li8/x;

    new-instance v0, Li8/x$a;

    invoke-direct {v0}, Li8/x$a;-><init>()V

    sput-object v0, Li8/x;->J:Lp8/j$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p4, p0, Li8/x;->C:I

    return-void
.end method

.method public static e(I)Li8/x;
    .locals 1

    .prologue
    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Li8/x;->I:Li8/x;

    return-object p0

    :cond_1
    sget-object p0, Li8/x;->H:Li8/x;

    return-object p0

    :cond_2
    sget-object p0, Li8/x;->G:Li8/x;

    return-object p0

    :cond_3
    sget-object p0, Li8/x;->F:Li8/x;

    return-object p0

    :cond_4
    sget-object p0, Li8/x;->E:Li8/x;

    return-object p0

    :cond_5
    sget-object p0, Li8/x;->D:Li8/x;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Li8/x;
    .locals 1

    const-class v0, Li8/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li8/x;

    return-object p0
.end method

.method public static values()[Li8/x;
    .locals 1

    sget-object v0, Li8/x;->K:[Li8/x;

    invoke-virtual {v0}, [Li8/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li8/x;

    return-object v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Li8/x;->C:I

    return v0
.end method
