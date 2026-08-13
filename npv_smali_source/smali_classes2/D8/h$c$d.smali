.class final LD8/h$c$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/h$c;-><init>(LD8/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/h$c;


# direct methods
.method constructor <init>(LD8/h$c;)V
    .locals 0

    iput-object p1, p0, LD8/h$c$d;->D:LD8/h$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/h$c$d;->D:LD8/h$c;

    invoke-static {v0, p1}, LD8/h$c;->i(LD8/h$c;Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, LD8/h$c$d;->a(Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
