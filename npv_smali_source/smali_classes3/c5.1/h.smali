.class public final synthetic Lc5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/k;


# instance fields
.field public final synthetic a:Lc5/i;


# direct methods
.method public synthetic constructor <init>(Lc5/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/h;->a:Lc5/i;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ll4/l;
    .locals 1

    iget-object v0, p0, Lc5/h;->a:Lc5/i;

    check-cast p1, Lc5/c;

    invoke-static {v0, p1}, Lc5/i;->b(Lc5/i;Lc5/c;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
