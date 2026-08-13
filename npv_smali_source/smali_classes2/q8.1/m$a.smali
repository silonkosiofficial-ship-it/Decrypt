.class final Lq8/m$a;
.super Lq8/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lq8/m;-><init>(Ljava/lang/String;ILy7/k;)V

    return-void
.end method


# virtual methods
.method public g(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    const-string v0, "string"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "<"

    const-string v3, "&lt;"

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LS8/r;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, ">"

    const-string v9, "&gt;"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, LS8/r;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
