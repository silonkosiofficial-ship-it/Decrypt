.class final enum LZ7/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field public static final enum E:LZ7/e$c;

.field public static final enum F:LZ7/e$c;

.field public static final enum G:LZ7/e$c;

.field public static final enum H:LZ7/e$c;

.field private static final synthetic I:[LZ7/e$c;


# instance fields
.field public final C:Z

.field public final D:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LZ7/e$c;

    const-string v1, "NON_STABLE_DECLARED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, LZ7/e$c;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, LZ7/e$c;->E:LZ7/e$c;

    new-instance v1, LZ7/e$c;

    const-string v3, "STABLE_DECLARED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4, v2}, LZ7/e$c;-><init>(Ljava/lang/String;IZZ)V

    sput-object v1, LZ7/e$c;->F:LZ7/e$c;

    new-instance v3, LZ7/e$c;

    const-string v5, "NON_STABLE_SYNTHESIZED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v2, v4}, LZ7/e$c;-><init>(Ljava/lang/String;IZZ)V

    sput-object v3, LZ7/e$c;->G:LZ7/e$c;

    new-instance v5, LZ7/e$c;

    const-string v7, "STABLE_SYNTHESIZED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v4, v4}, LZ7/e$c;-><init>(Ljava/lang/String;IZZ)V

    sput-object v5, LZ7/e$c;->H:LZ7/e$c;

    const/4 v7, 0x4

    new-array v7, v7, [LZ7/e$c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, LZ7/e$c;->I:[LZ7/e$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, LZ7/e$c;->C:Z

    iput-boolean p4, p0, LZ7/e$c;->D:Z

    return-void
.end method

.method private static synthetic e(I)V
    .locals 2

    const/4 p0, 0x2

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus"

    const/4 v1, 0x0

    aput-object v0, p0, v1

    const-string v0, "get"

    const/4 v1, 0x1

    aput-object v0, p0, v1

    const-string v0, "@NotNull method %s.%s must not return null"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static g(ZZ)LZ7/e$c;
    .locals 0

    .prologue
    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    sget-object p0, LZ7/e$c;->H:LZ7/e$c;

    goto :goto_0

    :cond_0
    sget-object p0, LZ7/e$c;->F:LZ7/e$c;

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    sget-object p0, LZ7/e$c;->G:LZ7/e$c;

    goto :goto_0

    :cond_2
    sget-object p0, LZ7/e$c;->E:LZ7/e$c;

    :goto_0
    if-nez p0, :cond_3

    const/4 p1, 0x0

    invoke-static {p1}, LZ7/e$c;->e(I)V

    :cond_3
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LZ7/e$c;
    .locals 1

    const-class v0, LZ7/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LZ7/e$c;

    return-object p0
.end method

.method public static values()[LZ7/e$c;
    .locals 1

    sget-object v0, LZ7/e$c;->I:[LZ7/e$c;

    invoke-virtual {v0}, [LZ7/e$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LZ7/e$c;

    return-object v0
.end method
