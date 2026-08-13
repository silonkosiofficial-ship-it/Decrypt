.class public final enum Lm1/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum C:Lm1/e$b;

.field public static final enum D:Lm1/e$b;

.field public static final enum E:Lm1/e$b;

.field public static final enum F:Lm1/e$b;

.field private static final synthetic G:[Lm1/e$b;

.field private static final synthetic H:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm1/e$b;

    const-string v1, "FIXED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm1/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/e$b;->C:Lm1/e$b;

    new-instance v0, Lm1/e$b;

    const-string v1, "WRAP_CONTENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lm1/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/e$b;->D:Lm1/e$b;

    new-instance v0, Lm1/e$b;

    const-string v1, "MATCH_CONSTRAINT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lm1/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/e$b;->E:Lm1/e$b;

    new-instance v0, Lm1/e$b;

    const-string v1, "MATCH_PARENT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lm1/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/e$b;->F:Lm1/e$b;

    invoke-static {}, Lm1/e$b;->e()[Lm1/e$b;

    move-result-object v0

    sput-object v0, Lm1/e$b;->G:[Lm1/e$b;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lm1/e$b;->H:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lm1/e$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lm1/e$b;

    sget-object v1, Lm1/e$b;->C:Lm1/e$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lm1/e$b;->D:Lm1/e$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lm1/e$b;->E:Lm1/e$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lm1/e$b;->F:Lm1/e$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm1/e$b;
    .locals 1

    const-class v0, Lm1/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm1/e$b;

    return-object p0
.end method

.method public static values()[Lm1/e$b;
    .locals 1

    sget-object v0, Lm1/e$b;->G:[Lm1/e$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm1/e$b;

    return-object v0
.end method
