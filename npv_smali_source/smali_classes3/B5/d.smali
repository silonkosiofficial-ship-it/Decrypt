.class public final LB5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB5/d$b;
    }
.end annotation


# static fields
.field private static final e:Lz5/d;

.field private static final f:Lz5/f;

.field private static final g:Lz5/f;

.field private static final h:LB5/d$b;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private c:Lz5/d;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB5/a;

    invoke-direct {v0}, LB5/a;-><init>()V

    sput-object v0, LB5/d;->e:Lz5/d;

    new-instance v0, LB5/b;

    invoke-direct {v0}, LB5/b;-><init>()V

    sput-object v0, LB5/d;->f:Lz5/f;

    new-instance v0, LB5/c;

    invoke-direct {v0}, LB5/c;-><init>()V

    sput-object v0, LB5/d;->g:Lz5/f;

    new-instance v0, LB5/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB5/d$b;-><init>(LB5/d$a;)V

    sput-object v0, LB5/d;->h:LB5/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LB5/d;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LB5/d;->b:Ljava/util/Map;

    sget-object v0, LB5/d;->e:Lz5/d;

    iput-object v0, p0, LB5/d;->c:Lz5/d;

    const/4 v0, 0x0

    iput-boolean v0, p0, LB5/d;->d:Z

    const-class v0, Ljava/lang/String;

    sget-object v1, LB5/d;->f:Lz5/f;

    invoke-virtual {p0, v0, v1}, LB5/d;->p(Ljava/lang/Class;Lz5/f;)LB5/d;

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, LB5/d;->g:Lz5/f;

    invoke-virtual {p0, v0, v1}, LB5/d;->p(Ljava/lang/Class;Lz5/f;)LB5/d;

    const-class v0, Ljava/util/Date;

    sget-object v1, LB5/d;->h:LB5/d$b;

    invoke-virtual {p0, v0, v1}, LB5/d;->p(Ljava/lang/Class;Lz5/f;)LB5/d;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Boolean;Lz5/g;)V
    .locals 0

    invoke-static {p0, p1}, LB5/d;->n(Ljava/lang/Boolean;Lz5/g;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Object;Lz5/e;)V
    .locals 0

    invoke-static {p0, p1}, LB5/d;->l(Ljava/lang/Object;Lz5/e;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Lz5/g;)V
    .locals 0

    invoke-static {p0, p1}, LB5/d;->m(Ljava/lang/String;Lz5/g;)V

    return-void
.end method

.method static synthetic e(LB5/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LB5/d;->a:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic f(LB5/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LB5/d;->b:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic g(LB5/d;)Lz5/d;
    .locals 0

    iget-object p0, p0, LB5/d;->c:Lz5/d;

    return-object p0
.end method

.method static synthetic h(LB5/d;)Z
    .locals 0

    iget-boolean p0, p0, LB5/d;->d:Z

    return p0
.end method

.method private static synthetic l(Ljava/lang/Object;Lz5/e;)V
    .locals 2

    new-instance p1, Lz5/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lz5/b;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static synthetic m(Ljava/lang/String;Lz5/g;)V
    .locals 0

    invoke-interface {p1, p0}, Lz5/g;->e(Ljava/lang/String;)Lz5/g;

    return-void
.end method

.method private static synthetic n(Ljava/lang/Boolean;Lz5/g;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, Lz5/g;->f(Z)Lz5/g;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;Lz5/d;)LA5/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, LB5/d;->o(Ljava/lang/Class;Lz5/d;)LB5/d;

    move-result-object p1

    return-object p1
.end method

.method public i()Lz5/a;
    .locals 1

    new-instance v0, LB5/d$a;

    invoke-direct {v0, p0}, LB5/d$a;-><init>(LB5/d;)V

    return-object v0
.end method

.method public j(LA5/a;)LB5/d;
    .locals 0

    invoke-interface {p1, p0}, LA5/a;->a(LA5/b;)V

    return-object p0
.end method

.method public k(Z)LB5/d;
    .locals 0

    iput-boolean p1, p0, LB5/d;->d:Z

    return-object p0
.end method

.method public o(Ljava/lang/Class;Lz5/d;)LB5/d;
    .locals 1

    iget-object v0, p0, LB5/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, LB5/d;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public p(Ljava/lang/Class;Lz5/f;)LB5/d;
    .locals 1

    iget-object v0, p0, LB5/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, LB5/d;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
