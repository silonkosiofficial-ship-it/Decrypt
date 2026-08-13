.class final Lca/c$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca/c;->f(Lda/a;)[Li7/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lca/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lca/c$d;

    invoke-direct {v0}, Lca/c$d;-><init>()V

    sput-object v0, Lca/c$d;->D:Lca/c$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lda/a;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lda/c;->e()Ljava/lang/String;

    move-result-object p1

    const-string v0, "item"

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lda/a;

    invoke-virtual {p0, p1}, Lca/c$d;->a(Lda/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
