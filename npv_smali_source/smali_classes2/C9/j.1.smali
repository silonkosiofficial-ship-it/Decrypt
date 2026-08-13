.class public final LC9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC9/P;


# instance fields
.field private final a:Le0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Le0/d;)V
    .locals 1

    const-string v0, "composeSaveableStateHolder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/j;->a:Le0/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "stateId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC9/j;->a:Le0/d;

    invoke-interface {v0, p1}, Le0/d;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final b()Le0/d;
    .locals 1

    iget-object v0, p0, LC9/j;->a:Le0/d;

    return-object v0
.end method
