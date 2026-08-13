.class public final LO1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM1/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO1/d$b;
    }
.end annotation


# static fields
.field public static final f:LO1/d$b;

.field private static final g:Ljava/util/Set;

.field private static final h:LO1/h;


# instance fields
.field private final a:LX9/k;

.field private final b:LO1/c;

.field private final c:Lx7/p;

.field private final d:Lx7/a;

.field private final e:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LO1/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO1/d$b;-><init>(Ly7/k;)V

    sput-object v0, LO1/d;->f:LO1/d$b;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, LO1/d;->g:Ljava/util/Set;

    new-instance v0, LO1/h;

    invoke-direct {v0}, LO1/h;-><init>()V

    sput-object v0, LO1/d;->h:LO1/h;

    return-void
.end method

.method public constructor <init>(LX9/k;LO1/c;Lx7/p;Lx7/a;)V
    .locals 1

    const-string v0, "fileSystem"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinatorProducer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "producePath"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO1/d;->a:LX9/k;

    iput-object p2, p0, LO1/d;->b:LO1/c;

    iput-object p3, p0, LO1/d;->c:Lx7/p;

    iput-object p4, p0, LO1/d;->d:Lx7/a;

    new-instance p1, LO1/d$c;

    invoke-direct {p1, p0}, LO1/d$c;-><init>(LO1/d;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LO1/d;->e:Li7/n;

    return-void
.end method

.method public synthetic constructor <init>(LX9/k;LO1/c;Lx7/p;Lx7/a;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    sget-object p3, LO1/d$a;->D:LO1/d$a;

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LO1/d;-><init>(LX9/k;LO1/c;Lx7/p;Lx7/a;)V

    return-void
.end method

.method public static final synthetic b()Ljava/util/Set;
    .locals 1

    sget-object v0, LO1/d;->g:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic c()LO1/h;
    .locals 1

    sget-object v0, LO1/d;->h:LO1/h;

    return-object v0
.end method

.method public static final synthetic d(LO1/d;)LX9/Q;
    .locals 0

    invoke-direct {p0}, LO1/d;->f()LX9/Q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LO1/d;)Lx7/a;
    .locals 0

    iget-object p0, p0, LO1/d;->d:Lx7/a;

    return-object p0
.end method

.method private final f()LX9/Q;
    .locals 1

    iget-object v0, p0, LO1/d;->e:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX9/Q;

    return-object v0
.end method


# virtual methods
.method public a()LM1/x;
    .locals 10

    .prologue
    invoke-direct {p0}, LO1/d;->f()LX9/Q;

    move-result-object v0

    invoke-virtual {v0}, LX9/Q;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LO1/d;->h:LO1/h;

    monitor-enter v1

    :try_start_0
    sget-object v2, LO1/d;->g:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    new-instance v0, LO1/e;

    iget-object v5, p0, LO1/d;->a:LX9/k;

    invoke-direct {p0}, LO1/d;->f()LX9/Q;

    move-result-object v6

    iget-object v7, p0, LO1/d;->b:LO1/c;

    iget-object v1, p0, LO1/d;->c:Lx7/p;

    invoke-direct {p0}, LO1/d;->f()LX9/Q;

    move-result-object v2

    iget-object v3, p0, LO1/d;->a:LX9/k;

    invoke-interface {v1, v2, v3}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, LM1/n;

    new-instance v9, LO1/d$d;

    invoke-direct {v9, p0}, LO1/d$d;-><init>(LO1/d;)V

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, LO1/e;-><init>(LX9/k;LX9/Q;LO1/c;LM1/n;Lx7/a;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "There are multiple DataStores active for the same file: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled)."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v1

    throw v0
.end method
