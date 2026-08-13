.class final synthetic LI6/U$a$a;
.super Ly7/a;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/U$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/16 v6, 0x8

    const/4 v1, 0x1

    const-class v3, La7/e;

    const-string v4, "proceed"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ly7/a;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly7/a;->C:Ljava/lang/Object;

    check-cast v0, La7/e;

    invoke-static {v0, p1}, LI6/U$a;->H(La7/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, LI6/U$a$a;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
