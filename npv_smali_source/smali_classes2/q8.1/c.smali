.class public abstract Lq8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/c$k;,
        Lq8/c$l;
    }
.end annotation


# static fields
.field public static final a:Lq8/c$k;

.field public static final b:Lq8/c;

.field public static final c:Lq8/c;

.field public static final d:Lq8/c;

.field public static final e:Lq8/c;

.field public static final f:Lq8/c;

.field public static final g:Lq8/c;

.field public static final h:Lq8/c;

.field public static final i:Lq8/c;

.field public static final j:Lq8/c;

.field public static final k:Lq8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq8/c$k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq8/c$k;-><init>(Ly7/k;)V

    sput-object v0, Lq8/c;->a:Lq8/c$k;

    sget-object v1, Lq8/c$c;->D:Lq8/c$c;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v1

    sput-object v1, Lq8/c;->b:Lq8/c;

    sget-object v1, Lq8/c$a;->D:Lq8/c$a;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v1

    sput-object v1, Lq8/c;->c:Lq8/c;

    sget-object v1, Lq8/c$b;->D:Lq8/c$b;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v1

    sput-object v1, Lq8/c;->d:Lq8/c;

    sget-object v1, Lq8/c$d;->D:Lq8/c$d;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v1

    sput-object v1, Lq8/c;->e:Lq8/c;

    sget-object v1, Lq8/c$i;->D:Lq8/c$i;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v1

    sput-object v1, Lq8/c;->f:Lq8/c;

    sget-object v1, Lq8/c$f;->D:Lq8/c$f;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v1

    sput-object v1, Lq8/c;->g:Lq8/c;

    sget-object v1, Lq8/c$g;->D:Lq8/c$g;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v1

    sput-object v1, Lq8/c;->h:Lq8/c;

    sget-object v1, Lq8/c$j;->D:Lq8/c$j;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v1

    sput-object v1, Lq8/c;->i:Lq8/c;

    sget-object v1, Lq8/c$e;->D:Lq8/c$e;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v1

    sput-object v1, Lq8/c;->j:Lq8/c;

    sget-object v1, Lq8/c$h;->D:Lq8/c$h;

    invoke-virtual {v0, v1}, Lq8/c$k;->b(Lx7/l;)Lq8/c;

    move-result-object v0

    sput-object v0, Lq8/c;->k:Lq8/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic s(Lq8/c;LP7/c;LP7/e;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lq8/c;->r(LP7/c;LP7/e;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: renderAnnotation"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract q(LO7/m;)Ljava/lang/String;
.end method

.method public abstract r(LP7/c;LP7/e;)Ljava/lang/String;
.end method

.method public abstract t(Ljava/lang/String;Ljava/lang/String;LL7/g;)Ljava/lang/String;
.end method

.method public abstract u(Ln8/d;)Ljava/lang/String;
.end method

.method public abstract v(Ln8/f;Z)Ljava/lang/String;
.end method

.method public abstract w(LF8/E;)Ljava/lang/String;
.end method

.method public abstract x(LF8/i0;)Ljava/lang/String;
.end method

.method public final y(Lx7/l;)Lq8/c;
    .locals 1

    const-string v0, "changeOptions"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Lq8/d;

    invoke-virtual {v0}, Lq8/d;->f0()Lq8/g;

    move-result-object v0

    invoke-virtual {v0}, Lq8/g;->q()Lq8/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lq8/g;->m0()V

    new-instance p1, Lq8/d;

    invoke-direct {p1, v0}, Lq8/d;-><init>(Lq8/g;)V

    return-object p1
.end method
