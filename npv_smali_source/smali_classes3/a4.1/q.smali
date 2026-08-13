.class public final synthetic La4/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:La4/r;


# direct methods
.method public synthetic constructor <init>(La4/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/q;->a:La4/r;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La4/q;->a:La4/r;

    invoke-static {v0, p1}, La4/r;->b(La4/r;Ll4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
