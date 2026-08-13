.class public final synthetic LM5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/h;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:LM5/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LM5/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM5/g;->a:Ljava/lang/String;

    iput-object p2, p0, LM5/g;->b:LM5/h$a;

    return-void
.end method


# virtual methods
.method public final a(Le5/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LM5/g;->a:Ljava/lang/String;

    iget-object v1, p0, LM5/g;->b:LM5/h$a;

    invoke-static {v0, v1, p1}, LM5/h;->a(Ljava/lang/String;LM5/h$a;Le5/e;)LM5/f;

    move-result-object p1

    return-object p1
.end method
