.class public final enum Li8/h$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp8/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum D:Li8/h$c;

.field public static final enum E:Li8/h$c;

.field public static final enum F:Li8/h$c;

.field private static G:Lp8/j$b;

.field private static final synthetic H:[Li8/h$c;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Li8/h$c;

    const-string v1, "TRUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Li8/h$c;-><init>(Ljava/lang/String;III)V

    sput-object v0, Li8/h$c;->D:Li8/h$c;

    new-instance v1, Li8/h$c;

    const-string v3, "FALSE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4, v4}, Li8/h$c;-><init>(Ljava/lang/String;III)V

    sput-object v1, Li8/h$c;->E:Li8/h$c;

    new-instance v3, Li8/h$c;

    const-string v5, "NULL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6, v6}, Li8/h$c;-><init>(Ljava/lang/String;III)V

    sput-object v3, Li8/h$c;->F:Li8/h$c;

    const/4 v5, 0x3

    new-array v5, v5, [Li8/h$c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Li8/h$c;->H:[Li8/h$c;

    new-instance v0, Li8/h$c$a;

    invoke-direct {v0}, Li8/h$c$a;-><init>()V

    sput-object v0, Li8/h$c;->G:Lp8/j$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p4, p0, Li8/h$c;->C:I

    return-void
.end method

.method public static e(I)Li8/h$c;
    .locals 1

    .prologue
    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Li8/h$c;->F:Li8/h$c;

    return-object p0

    :cond_1
    sget-object p0, Li8/h$c;->E:Li8/h$c;

    return-object p0

    :cond_2
    sget-object p0, Li8/h$c;->D:Li8/h$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Li8/h$c;
    .locals 1

    const-class v0, Li8/h$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li8/h$c;

    return-object p0
.end method

.method public static values()[Li8/h$c;
    .locals 1

    sget-object v0, Li8/h$c;->H:[Li8/h$c;

    invoke-virtual {v0}, [Li8/h$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li8/h$c;

    return-object v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Li8/h$c;->C:I

    return v0
.end method
