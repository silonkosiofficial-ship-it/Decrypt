.class public final LI6/E;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI6/E$a;,
        LI6/E$b;,
        LI6/E$c;,
        LI6/E$d;
    }
.end annotation


# static fields
.field public static final c:LI6/E$d;

.field private static final d:LW6/a;


# instance fields
.field private final a:I

.field private final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    new-instance v0, LI6/E$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI6/E$d;-><init>(Ly7/k;)V

    sput-object v0, LI6/E;->c:LI6/E$d;

    const-class v0, LI6/E;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    :try_start_0
    invoke-static {v0}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    new-instance v0, Lb7/a;

    invoke-direct {v0, v2, v1}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance v1, LW6/a;

    const-string v2, "HttpSend"

    invoke-direct {v1, v2, v0}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v1, LI6/E;->d:LW6/a;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LI6/E;->a:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LI6/E;->b:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILy7/k;)V
    .locals 0

    invoke-direct {p0, p1}, LI6/E;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LI6/E;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LI6/E;->b:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic b()LW6/a;
    .locals 1

    sget-object v0, LI6/E;->d:LW6/a;

    return-object v0
.end method

.method public static final synthetic c(LI6/E;)I
    .locals 0

    iget p0, p0, LI6/E;->a:I

    return p0
.end method


# virtual methods
.method public final d(Lx7/q;)V
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LI6/E;->b:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method
