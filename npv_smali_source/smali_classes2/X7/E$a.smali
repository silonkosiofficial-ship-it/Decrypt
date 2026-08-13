.class final LX7/E$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX7/E;-><init>(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LX7/E;


# direct methods
.method constructor <init>(LX7/E;)V
    .locals 0

    iput-object p1, p0, LX7/E$a;->D:LX7/E;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/c;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, p0, LX7/E$a;->D:LX7/E;

    invoke-virtual {v0}, LX7/E;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, v0}, Ln8/e;->a(Ln8/c;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/c;

    invoke-virtual {p0, p1}, LX7/E$a;->a(Ln8/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
