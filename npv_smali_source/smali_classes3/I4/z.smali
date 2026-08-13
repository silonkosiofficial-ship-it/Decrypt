.class final LI4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI4/a;


# instance fields
.field private final a:LI4/k;


# direct methods
.method constructor <init>(LI4/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI4/z;->a:LI4/k;

    return-void
.end method


# virtual methods
.method public final a(LI4/d;)Ll4/l;
    .locals 1

    iget-object v0, p0, LI4/z;->a:LI4/k;

    invoke-virtual {v0, p1}, LI4/k;->b(LI4/d;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
