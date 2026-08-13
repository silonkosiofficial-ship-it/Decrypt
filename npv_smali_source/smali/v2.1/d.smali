.class public final Lv2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/e$c;


# instance fields
.field private final a:Lz2/e$c;

.field private final b:Lv2/b;


# direct methods
.method public constructor <init>(Lz2/e$c;Lv2/b;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/d;->a:Lz2/e$c;

    iput-object p2, p0, Lv2/d;->b:Lv2/b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lz2/e$b;)Lz2/e;
    .locals 0

    invoke-virtual {p0, p1}, Lv2/d;->b(Lz2/e$b;)Lv2/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Lz2/e$b;)Lv2/c;
    .locals 2

    const-string v0, "configuration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv2/c;

    iget-object v1, p0, Lv2/d;->a:Lz2/e$c;

    invoke-interface {v1, p1}, Lz2/e$c;->a(Lz2/e$b;)Lz2/e;

    move-result-object p1

    iget-object v1, p0, Lv2/d;->b:Lv2/b;

    invoke-direct {v0, p1, v1}, Lv2/c;-><init>(Lz2/e;Lv2/b;)V

    return-object v0
.end method
