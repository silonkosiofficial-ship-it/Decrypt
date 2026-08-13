.class public final LC9/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/d;->d(ZLx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LF9/a;

.field final synthetic b:LC9/d$a;


# direct methods
.method public constructor <init>(LF9/a;LC9/d$a;)V
    .locals 0

    iput-object p1, p0, LC9/d$b;->a:LF9/a;

    iput-object p2, p0, LC9/d$b;->b:LC9/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, LC9/d$b;->a:LF9/a;

    iget-object v1, p0, LC9/d$b;->b:LC9/d$a;

    invoke-virtual {v0, v1}, LF9/a;->j(LF9/c;)V

    return-void
.end method
