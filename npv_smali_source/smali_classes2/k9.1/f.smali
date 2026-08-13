.class public final Lk9/f;
.super Lk9/h;
.source "SourceFile"


# instance fields
.field private final b:Ll9/e;

.field private final c:Lm9/q;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const-string v0, "formats"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lk9/h;-><init>(Ljava/util/List;)V

    invoke-super {p0}, Lk9/h;->a()Ll9/e;

    move-result-object p1

    iput-object p1, p0, Lk9/f;->b:Ll9/e;

    invoke-super {p0}, Lk9/h;->b()Lm9/q;

    move-result-object p1

    iput-object p1, p0, Lk9/f;->c:Lm9/q;

    return-void
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 1

    iget-object v0, p0, Lk9/f;->b:Ll9/e;

    return-object v0
.end method

.method public b()Lm9/q;
    .locals 1

    iget-object v0, p0, Lk9/f;->c:Lm9/q;

    return-object v0
.end method
