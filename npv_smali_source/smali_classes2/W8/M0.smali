.class public final LW8/M0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/f0;
.implements LW8/s;


# static fields
.field public static final C:LW8/M0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW8/M0;

    invoke-direct {v0}, LW8/M0;-><init>()V

    sput-object v0, LW8/M0;->C:LW8/M0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 0

    return-void
.end method

.method public g(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getParent()LW8/z0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
