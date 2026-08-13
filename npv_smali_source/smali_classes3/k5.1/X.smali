.class public final synthetic Lk5/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Lk5/Z;


# direct methods
.method public synthetic constructor <init>(Lk5/Z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/X;->a:Lk5/Z;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk5/X;->a:Lk5/Z;

    invoke-static {v0, p1}, Lk5/Z;->b(Lk5/Z;Ll4/l;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
