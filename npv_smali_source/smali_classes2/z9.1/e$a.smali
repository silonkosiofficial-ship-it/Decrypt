.class public final Lz9/e$a;
.super Lw9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz9/e;->t0(Ljava/lang/String;Lv9/f;)Lz9/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz9/e;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lv9/f;


# direct methods
.method constructor <init>(Lz9/e;Ljava/lang/String;Lv9/f;)V
    .locals 0

    iput-object p1, p0, Lz9/e$a;->a:Lz9/e;

    iput-object p2, p0, Lz9/e$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lz9/e$a;->c:Lv9/f;

    invoke-direct {p0}, Lw9/b;-><init>()V

    return-void
.end method


# virtual methods
.method public E(Ljava/lang/String;)V
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/e$a;->a:Lz9/e;

    iget-object v1, p0, Lz9/e$a;->b:Ljava/lang/String;

    new-instance v2, Ly9/w;

    const/4 v3, 0x0

    iget-object v4, p0, Lz9/e$a;->c:Lv9/f;

    invoke-direct {v2, p1, v3, v4}, Ly9/w;-><init>(Ljava/lang/Object;ZLv9/f;)V

    invoke-virtual {v0, v1, v2}, Lz9/e;->v0(Ljava/lang/String;Ly9/i;)V

    return-void
.end method
