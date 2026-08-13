.class public abstract LI7/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "b"
.end annotation


# static fields
.field static final synthetic c:[LF7/k;


# instance fields
.field private final a:LI7/F$a;

.field final synthetic b:LI7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LI7/n$b;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "moduleData"

    const-string v3, "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LI7/n$b;->c:[LF7/k;

    return-void
.end method

.method public constructor <init>(LI7/n;)V
    .locals 1

    iput-object p1, p0, LI7/n$b;->b:LI7/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LI7/n$b$a;

    invoke-direct {v0, p1}, LI7/n$b$a;-><init>(LI7/n;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object p1

    iput-object p1, p0, LI7/n$b;->a:LI7/F$a;

    return-void
.end method


# virtual methods
.method public final a()LT7/k;
    .locals 3

    iget-object v0, p0, LI7/n$b;->a:LI7/F$a;

    sget-object v1, LI7/n$b;->c:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LI7/F$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LT7/k;

    return-object v0
.end method
