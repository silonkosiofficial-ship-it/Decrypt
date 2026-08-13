.class final LM0/B$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$j;

    invoke-direct {v0}, LM0/B$j;-><init>()V

    sput-object v0, LM0/B$j;->D:LM0/B$j;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LM0/h$a;
    .locals 4

    .prologue
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LM0/B;->w()Le0/j;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    instance-of v3, v2, LM0/n;

    if-nez v3, :cond_2

    :cond_1
    move-object p1, v1

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_1

    invoke-interface {v2, p1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM0/L;

    :goto_1
    new-instance v2, LM0/h$a;

    invoke-direct {v2, v0, p1, v1}, LM0/h$a;-><init>(Ljava/lang/String;LM0/L;LM0/i;)V

    return-object v2
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM0/B$j;->a(Ljava/lang/Object;)LM0/h$a;

    move-result-object p1

    return-object p1
.end method
