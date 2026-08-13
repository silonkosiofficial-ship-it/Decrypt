.class public final Lm8/f;
.super Lm8/g;
.source "SourceFile"


# instance fields
.field private final h:Ll8/a$e;


# direct methods
.method public constructor <init>(Ll8/a$e;[Ljava/lang/String;)V
    .locals 3

    .prologue
    const-string v0, "types"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strings"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll8/a$e;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Ll8/a$e;->y()Ljava/util/List;

    move-result-object v1

    const-string v2, "getRecordList(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lm8/h;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, p2, v0, v1}, Lm8/g;-><init>([Ljava/lang/String;Ljava/util/Set;Ljava/util/List;)V

    iput-object p1, p0, Lm8/f;->h:Ll8/a$e;

    return-void
.end method
