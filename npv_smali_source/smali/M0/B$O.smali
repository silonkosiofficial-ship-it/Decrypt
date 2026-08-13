.class final LM0/B$O;
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
.field public static final D:LM0/B$O;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$O;

    invoke-direct {v0}, LM0/B$O;-><init>()V

    sput-object v0, LM0/B$O;->D:LM0/B$O;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LY0/x;
    .locals 3

    .prologue
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LY0/x;->b:LY0/x$a;

    invoke-virtual {p1}, LY0/x$a;->a()J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, LY0/x;->b(J)LY0/x;

    move-result-object p1

    goto :goto_2

    :cond_0
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Float;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    move-object v1, p1

    check-cast v1, LY0/z;

    :cond_2
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LY0/z;->j()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LY0/y;->a(FJ)J

    move-result-wide v0

    goto :goto_0

    :goto_2
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM0/B$O;->a(Ljava/lang/Object;)LY0/x;

    move-result-object p1

    return-object p1
.end method
