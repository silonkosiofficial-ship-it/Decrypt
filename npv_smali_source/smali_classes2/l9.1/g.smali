.class public final Ll9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/e;


# instance fields
.field private final a:Ll9/e;

.field private final b:Lx7/l;

.field private final c:Z


# direct methods
.method public constructor <init>(Ll9/e;Lx7/l;Z)V
    .locals 1

    const-string v0, "formatter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allSubFormatsNegative"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/g;->a:Ll9/e;

    iput-object p2, p0, Ll9/g;->b:Lx7/l;

    iput-boolean p3, p0, Ll9/g;->c:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Appendable;Z)V
    .locals 3

    .prologue
    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x2d

    if-nez p3, :cond_0

    iget-object v1, p0, Ll9/g;->b:Lx7/l;

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Ll9/g;->c:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x2b

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v2

    invoke-interface {p2, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_2
    iget-object v2, p0, Ll9/g;->a:Ll9/e;

    if-nez p3, :cond_5

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result p3

    if-ne p3, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p3, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 p3, 0x1

    :goto_3
    invoke-interface {v2, p1, p2, p3}, Ll9/e;->a(Ljava/lang/Object;Ljava/lang/Appendable;Z)V

    return-void
.end method
