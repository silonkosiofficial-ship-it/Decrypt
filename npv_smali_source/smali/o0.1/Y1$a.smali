.class public final Lo0/Y1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/e2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/Y1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(JLY0/v;LY0/e;)Lo0/L1;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lo0/Y1$a;->b(JLY0/v;LY0/e;)Lo0/L1$b;

    move-result-object p1

    return-object p1
.end method

.method public b(JLY0/v;LY0/e;)Lo0/L1$b;
    .locals 0

    new-instance p3, Lo0/L1$b;

    invoke-static {p1, p2}, Ln0/n;->c(J)Ln0/i;

    move-result-object p1

    invoke-direct {p3, p1}, Lo0/L1$b;-><init>(Ln0/i;)V

    return-object p3
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "RectangleShape"

    return-object v0
.end method
