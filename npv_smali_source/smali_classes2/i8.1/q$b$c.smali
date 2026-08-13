.class public final enum Li8/q$b$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp8/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/q$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum D:Li8/q$b$c;

.field public static final enum E:Li8/q$b$c;

.field public static final enum F:Li8/q$b$c;

.field public static final enum G:Li8/q$b$c;

.field private static H:Lp8/j$b;

.field private static final synthetic I:[Li8/q$b$c;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Li8/q$b$c;

    const-string v1, "IN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Li8/q$b$c;-><init>(Ljava/lang/String;III)V

    sput-object v0, Li8/q$b$c;->D:Li8/q$b$c;

    new-instance v1, Li8/q$b$c;

    const-string v3, "OUT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4, v4}, Li8/q$b$c;-><init>(Ljava/lang/String;III)V

    sput-object v1, Li8/q$b$c;->E:Li8/q$b$c;

    new-instance v3, Li8/q$b$c;

    const-string v5, "INV"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6, v6}, Li8/q$b$c;-><init>(Ljava/lang/String;III)V

    sput-object v3, Li8/q$b$c;->F:Li8/q$b$c;

    new-instance v5, Li8/q$b$c;

    const-string v7, "STAR"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8, v8}, Li8/q$b$c;-><init>(Ljava/lang/String;III)V

    sput-object v5, Li8/q$b$c;->G:Li8/q$b$c;

    const/4 v7, 0x4

    new-array v7, v7, [Li8/q$b$c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Li8/q$b$c;->I:[Li8/q$b$c;

    new-instance v0, Li8/q$b$c$a;

    invoke-direct {v0}, Li8/q$b$c$a;-><init>()V

    sput-object v0, Li8/q$b$c;->H:Lp8/j$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p4, p0, Li8/q$b$c;->C:I

    return-void
.end method

.method public static e(I)Li8/q$b$c;
    .locals 1

    .prologue
    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Li8/q$b$c;->G:Li8/q$b$c;

    return-object p0

    :cond_1
    sget-object p0, Li8/q$b$c;->F:Li8/q$b$c;

    return-object p0

    :cond_2
    sget-object p0, Li8/q$b$c;->E:Li8/q$b$c;

    return-object p0

    :cond_3
    sget-object p0, Li8/q$b$c;->D:Li8/q$b$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Li8/q$b$c;
    .locals 1

    const-class v0, Li8/q$b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li8/q$b$c;

    return-object p0
.end method

.method public static values()[Li8/q$b$c;
    .locals 1

    sget-object v0, Li8/q$b$c;->I:[Li8/q$b$c;

    invoke-virtual {v0}, [Li8/q$b$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li8/q$b$c;

    return-object v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Li8/q$b$c;->C:I

    return v0
.end method
