.class final synthetic LG6/h$c;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/h;-><init>(LG6/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, LG6/h;

    const-string v4, "createOkHttpClient"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ly7/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI6/G;

    invoke-virtual {p0, p1}, LG6/h$c;->s(LI6/G;)LH9/x;

    move-result-object p1

    return-object p1
.end method

.method public final s(LI6/G;)LH9/x;
    .locals 1

    iget-object v0, p0, Ly7/f;->D:Ljava/lang/Object;

    check-cast v0, LG6/h;

    invoke-static {v0, p1}, LG6/h;->H(LG6/h;LI6/G;)LH9/x;

    move-result-object p1

    return-object p1
.end method
