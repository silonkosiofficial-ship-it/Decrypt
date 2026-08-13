.class public final Lr2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/e;


# direct methods
.method public constructor <init>(Lz2/e;)V
    .locals 1

    const-string v0, "openHelper"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/c;->a:Lz2/e;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;)Ly2/b;
    .locals 0

    invoke-virtual {p0, p1}, Lr2/c;->c(Ljava/lang/String;)Lr2/a;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lz2/e;
    .locals 1

    iget-object v0, p0, Lr2/c;->a:Lz2/e;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lr2/a;
    .locals 1

    const-string v0, "fileName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lr2/a;

    iget-object v0, p0, Lr2/c;->a:Lz2/e;

    invoke-interface {v0}, Lz2/e;->v0()Lz2/d;

    move-result-object v0

    invoke-direct {p1, v0}, Lr2/a;-><init>(Lz2/d;)V

    return-object p1
.end method
