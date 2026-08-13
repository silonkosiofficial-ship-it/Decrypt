.class public Lha/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lia/a;


# instance fields
.field private final a:Lha/n;

.field private final b:Ljava/lang/InheritableThreadLocal;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lha/n;

    invoke-direct {v0}, Lha/n;-><init>()V

    iput-object v0, p0, Lha/b;->a:Lha/n;

    new-instance v0, Lha/b$a;

    invoke-direct {v0, p0}, Lha/b$a;-><init>(Lha/b;)V

    iput-object v0, p0, Lha/b;->b:Ljava/lang/InheritableThreadLocal;

    return-void
.end method
