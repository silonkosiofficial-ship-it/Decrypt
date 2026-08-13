.class public abstract LJ7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ7/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/f$a;,
        LJ7/f$b;,
        LJ7/f$c;,
        LJ7/f$d;,
        LJ7/f$e;,
        LJ7/f$f;,
        LJ7/f$g;,
        LJ7/f$h;
    }
.end annotation


# static fields
.field public static final e:LJ7/f$d;


# instance fields
.field private final a:Ljava/lang/reflect/Member;

.field private final b:Ljava/lang/reflect/Type;

.field private final c:Ljava/lang/Class;

.field private final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJ7/f$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ7/f$d;-><init>(Ly7/k;)V

    sput-object v0, LJ7/f;->e:LJ7/f$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/f;->a:Ljava/lang/reflect/Member;

    iput-object p2, p0, LJ7/f;->b:Ljava/lang/reflect/Type;

    iput-object p3, p0, LJ7/f;->c:Ljava/lang/Class;

    if-eqz p3, :cond_0

    new-instance p1, Ly7/U;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Ly7/U;-><init>(I)V

    invoke-virtual {p1, p3}, Ly7/U;->a(Ljava/lang/Object;)V

    invoke-virtual {p1, p4}, Ly7/U;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ly7/U;->c()I

    move-result p2

    new-array p2, p2, [Ljava/lang/reflect/Type;

    invoke-virtual {p1, p2}, Ly7/U;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {p4}, Lj7/n;->R0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :cond_1
    iput-object p1, p0, LJ7/f;->d:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LJ7/f;-><init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJ7/e$a;->a(LJ7/e;[Ljava/lang/Object;)V

    return-void
.end method

.method protected final b(Ljava/lang/Object;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p0, LJ7/f;->a:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "An object member requires the object instance passed as the first argument."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LJ7/f;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public final l()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, LJ7/f;->b:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LJ7/f;->d:Ljava/util/List;

    return-object v0
.end method

.method public final n()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, LJ7/f;->a:Ljava/lang/reflect/Member;

    return-object v0
.end method
