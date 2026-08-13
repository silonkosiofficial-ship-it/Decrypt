.class public final Lf8/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/m$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field final synthetic b:Lf8/m;


# direct methods
.method public constructor <init>(Lf8/m;Ljava/lang/String;)V
    .locals 1

    const-string v0, "className"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf8/m$a;->b:Lf8/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf8/m$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lx7/l;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf8/m$a;->b:Lf8/m;

    invoke-static {v0}, Lf8/m;->a(Lf8/m;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lf8/m$a$a;

    invoke-direct {v1, p0, p1}, Lf8/m$a$a;-><init>(Lf8/m$a;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lf8/m$a$a;->a()Li7/u;

    move-result-object p1

    invoke-virtual {p1}, Li7/u;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Li7/u;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf8/m$a;->a:Ljava/lang/String;

    return-object v0
.end method
