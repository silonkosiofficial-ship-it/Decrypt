.class public final synthetic Ly7/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Ly7/Z;


# direct methods
.method public synthetic constructor <init>(Ly7/Z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/Y;->C:Ly7/Z;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly7/Y;->C:Ly7/Z;

    check-cast p1, LF7/q;

    invoke-static {v0, p1}, Ly7/Z;->d(Ly7/Z;LF7/q;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
