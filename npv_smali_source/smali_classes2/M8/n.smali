.class public final LM8/n;
.super LM8/a$a;
.source "SourceFile"

# interfaces
.implements LB7/c;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LM8/a$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LF7/k;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM8/a;

    invoke-virtual {p0, p1, p2}, LM8/n;->d(LM8/a;LF7/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(LM8/a;LF7/k;)Ljava/lang/Object;
    .locals 1

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LM8/a$a;->c(LM8/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
