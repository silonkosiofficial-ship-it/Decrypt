.class public final LF8/W;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/W$a;
    }
.end annotation


# static fields
.field public static final e:LF8/W$a;


# instance fields
.field private final a:LF8/W;

.field private final b:LO7/e0;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF8/W$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/W$a;-><init>(Ly7/k;)V

    sput-object v0, LF8/W;->e:LF8/W$a;

    return-void
.end method

.method private constructor <init>(LF8/W;LO7/e0;Ljava/util/List;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/W;->a:LF8/W;

    iput-object p2, p0, LF8/W;->b:LO7/e0;

    iput-object p3, p0, LF8/W;->c:Ljava/util/List;

    iput-object p4, p0, LF8/W;->d:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(LF8/W;LO7/e0;Ljava/util/List;Ljava/util/Map;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LF8/W;-><init>(LF8/W;LO7/e0;Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LF8/W;->c:Ljava/util/List;

    return-object v0
.end method

.method public final b()LO7/e0;
    .locals 1

    iget-object v0, p0, LF8/W;->b:LO7/e0;

    return-object v0
.end method

.method public final c(LF8/e0;)LF8/i0;
    .locals 1

    .prologue
    const-string v0, "constructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    instance-of v0, p1, LO7/f0;

    if-eqz v0, :cond_0

    iget-object v0, p0, LF8/W;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/i0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final d(LO7/e0;)Z
    .locals 2

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/W;->b:LO7/e0;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LF8/W;->a:LF8/W;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LF8/W;->d(LO7/e0;)Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method
