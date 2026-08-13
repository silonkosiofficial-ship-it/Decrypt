.class public final Lb3/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lb3/f;

.field private b:Ljava/util/List;

.field private c:Lb3/b;

.field private d:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb3/a$a;->a:Lb3/f;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lb3/a$a;->b:Ljava/util/List;

    iput-object v0, p0, Lb3/a$a;->c:Lb3/b;

    const-string v0, ""

    iput-object v0, p0, Lb3/a$a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lb3/d;)Lb3/a$a;
    .locals 1

    iget-object v0, p0, Lb3/a$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lb3/a;
    .locals 5

    new-instance v0, Lb3/a;

    iget-object v1, p0, Lb3/a$a;->a:Lb3/f;

    iget-object v2, p0, Lb3/a$a;->b:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lb3/a$a;->c:Lb3/b;

    iget-object v4, p0, Lb3/a$a;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lb3/a;-><init>(Lb3/f;Ljava/util/List;Lb3/b;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lb3/a$a;
    .locals 0

    iput-object p1, p0, Lb3/a$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public d(Lb3/b;)Lb3/a$a;
    .locals 0

    iput-object p1, p0, Lb3/a$a;->c:Lb3/b;

    return-object p0
.end method

.method public e(Lb3/f;)Lb3/a$a;
    .locals 0

    iput-object p1, p0, Lb3/a$a;->a:Lb3/f;

    return-object p0
.end method
