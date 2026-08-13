.class public abstract Le0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Le0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Le0/k$a;->D:Le0/k$a;

    sget-object v1, Le0/k$b;->D:Le0/k$b;

    invoke-static {v0, v1}, Le0/k;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object v0

    sput-object v0, Le0/k;->a:Le0/j;

    return-void
.end method

.method public static final a(Lx7/p;Lx7/l;)Le0/j;
    .locals 1

    new-instance v0, Le0/k$c;

    invoke-direct {v0, p0, p1}, Le0/k$c;-><init>(Lx7/p;Lx7/l;)V

    return-object v0
.end method

.method public static final b()Le0/j;
    .locals 2

    sget-object v0, Le0/k;->a:Le0/j;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
