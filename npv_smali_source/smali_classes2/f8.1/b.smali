.class final Lf8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/c;


# static fields
.field public static final a:Lf8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf8/b;

    invoke-direct {v0}, Lf8/b;-><init>()V

    sput-object v0, Lf8/b;->a:Lf8/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()Ljava/lang/Void;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No methods should be called on this descriptor. Only its presence matters"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    invoke-direct {p0}, Lf8/b;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public e()Ln8/c;
    .locals 1

    invoke-static {p0}, LP7/c$a;->a(LP7/c;)Ln8/c;

    move-result-object v0

    return-object v0
.end method

.method public getType()LF8/E;
    .locals 1

    invoke-direct {p0}, Lf8/b;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public o()LO7/a0;
    .locals 1

    invoke-direct {p0}, Lf8/b;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "[EnhancedType]"

    return-object v0
.end method
